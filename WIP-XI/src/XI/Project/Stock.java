/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {

    public static void main(String[] args) {
        int item = 5;
        int limit = 10, menu;
        System.out.println("Item " + item + "\nLimit " + limit);
        System.out.println("1.Add \n2.Remove \n3.Check");
        System.out.println("Insert number ");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();
        if (menu == 1) {

            if (item < limit) {

                int amount;
                System.out.println("Input amount to add");
                amount = sc.nextInt();
                if (item + amount > limit) {
                    System.out.println("Item เกิน Limit");
                } else {
                    item = item + amount;
                    System.out.println("Item = " + item + "\nlimit = " + limit);
                }

            } else {

                System.out.println("Item เต็มแล้ว");
            }
        } else if (menu == 2) {

            if (item > 0) {

                int amount;
                System.out.println("Input amount to remove");
                amount = sc.nextInt();
                if (item - amount < 0) {
                    System.out.println("Item มีไม่พอให้ลบ");
                } else {
                    item = item - amount;
                    System.out.println("item = " + item + "\nlimit = " + limit);
                }
            } else {
                System.out.println("ไม่มี Item ในโกดัง");
            }
        } else if (menu == 3) {
            System.out.println("item = " + item + "\nlimit = " + limit);
        } else {
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }
}
