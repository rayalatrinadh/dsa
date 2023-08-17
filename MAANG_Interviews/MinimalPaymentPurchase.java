package com.MAANG_Interviews;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MinimalPaymentPurchase {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner priceScanner = new Scanner(new File("price.txt")); // reading price.txt file(inputFile)
        int numMerchandises = priceScanner.nextInt();
        ArrayList<Merchandise> merchandises = new ArrayList<>();
        for (int i = 0; i < numMerchandises; i++) {
            int id = priceScanner.nextInt();
            int amount = priceScanner.nextInt();
            float price = priceScanner.nextFloat();
            merchandises.add(new Merchandise(id, amount, price));
        }
        priceScanner.close();

        Scanner promoScanner = new Scanner(new File("promotions.txt"));// reading price.txt file(inputFile)
        int numPromotions = promoScanner.nextInt();
        ArrayList<Promotion> promotions = new ArrayList<>();
        for (int i = 0; i < numPromotions; i++) {
            int numTypes = promoScanner.nextInt();
            int[] ids = new int[numTypes];
            int[] amounts = new int[numTypes];
            for (int j = 0; j < numTypes; j++) {
                ids[j] = promoScanner.nextInt();
                amounts[j] = promoScanner.nextInt();
            }
            int promoPrice = promoScanner.nextInt();
            promotions.add(new Promotion(ids, amounts, promoPrice));
        }
        promoScanner.close();
        ArrayList<Promotion> duplicate = new ArrayList<>(promotions);
        Collections.sort(duplicate, Comparator.comparingDouble((Promotion p) -> -p.promoPrice));

        float totalPrice = 0;
        for(Promotion p : duplicate){
            while(p.appliesTo(merchandises)){
                totalPrice += p.getPromoPrice();
            }
        }
        PrintWriter writer = new PrintWriter(new File("output.txt"));//writing output.txt;
        for (Merchandise m : merchandises) {
            if(m.getAmount()>0) {
                writer.print(m.getId() + " " + m.getAmount() + " ");
                if((m.getPrice() - (int)(m.getPrice())) > 0.0){
                    writer.println(m.getPrice());
                } else {
                    writer.println((int)m.getPrice());
                }
                totalPrice += m.getAmount() * m.getPrice();
            }
        }
        for (Promotion p : promotions) {
            while(p.getIsApplied()>0){
                writer.println(p.toString());
                p.setIsApplied(p.getIsApplied() - 1);
            }
        }
        if((totalPrice - (int)(totalPrice)) > 0.0){
            writer.println(totalPrice);
        } else {
            writer.println((int)totalPrice);
        }
        writer.close();
    }

    private static class Merchandise {
        private final int id;
        private int amount;
        private final float price;

        public Merchandise(int id, int amount, float price) {
            this.id = id;
            this.amount = amount;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount -= amount;
        }

        public float getPrice() {
            return price;
        }
    }

    private static class Promotion {
        private final int[] ids;
        private final int[] amounts;
        private final float promoPrice;

        private int isApplied;

        public Promotion(int[] ids, int[] amounts, float promoPrice) {
            this.ids = ids;
            this.amounts = amounts;
            this.promoPrice = promoPrice;
        }

//        public boolean appliesTo(ArrayList<Merchandise> merchandises) {
//            for (int i = 0; i < ids.length; i++) {
//                boolean isFound = false;
//                for(Merchandise m : merchandises){
//                    if(ids[i] == m.getId()){
//                        isFound = true;
//                        if(m.getAmount() < amounts[i])
//                            return false;
//                    }
//                }
//                if(!isFound)
//                    return false;
//            }
//            for (int i = 0; i < ids.length; i++) {
//                for(Merchandise m : merchandises){
//                    if(ids[i] == m.getId()){
//                        m.setAmount(amounts[i]);
//                    }
//                }
//            }
//            isApplied++;
//            return true;
//        }

        public boolean appliesTo(ArrayList<Merchandise> merchandises) {
            // Check if all required merchandise is present with sufficient amounts
            for (int i = 0; i < ids.length; i++) {
                int id = ids[i];
                int requiredAmount = amounts[i];
                boolean foundMerchandise = false;
                for (Merchandise m : merchandises) {
                    if (m.getId() == id) {
                        foundMerchandise = true;
                        if (m.getAmount() < requiredAmount) {
                            return false;
                        }
                        break;
                    }
                }
                if (!foundMerchandise) {
                    return false;
                }
            }

            // Update merchandise amounts and increment isApplied
            for (int i = 0; i < ids.length; i++) {
                int id = ids[i];
                int newAmount = amounts[i];
                for (Merchandise m : merchandises) {
                    if (m.getId() == id) {
                        m.setAmount(newAmount);
                        break;
                    }
                }
            }
            isApplied++;
            return true;
        }


        public int getIsApplied(){
            return isApplied;
        }

        public void setIsApplied(int isApplied){
            this.isApplied = isApplied;
        }

        public float getPromoPrice() {
            return promoPrice;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ids.length; i++) {
                sb.append(ids[i]).append(" ").append(amounts[i]).append(" ");
            }
            if((promoPrice - (int)(promoPrice)) > 0.0){
                sb.append(promoPrice);
            } else {
                sb.append((int)promoPrice);
            }
            return sb.toString();
        }
    }
}

