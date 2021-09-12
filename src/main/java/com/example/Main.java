package com.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4
 *  Copyright 2021 Richard Nham
 */
public class Main
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

         System.out.print("Enter a noun: ");
         String noun = in.nextLine();

         System.out.print("Enter a verb: ");
         String verb = in.nextLine();

        System.out.print("Enter an adjective: ");
         String adj = in.nextLine();

        System.out.print("Enter an adverb: ");
         String adv = in.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);

    }
}