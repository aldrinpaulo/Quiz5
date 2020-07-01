/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequeexample;

import doublylinkedlist.DNode;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enubs
 */
public class DequeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        DNode<String> transact1 = new DNode<>(null, "John", null);
        DNode<String> transact2 = new DNode<>(null, "Dominique", null);
        DNode<String> transact3 = new DNode<>(null, "Kyle", null);
        DNode<String> transact4 = new DNode<>(null, "Shaun", null);
        DNode<String> transact5 = new DNode<>(null, "Jerson", null);

        
        DequeList<DNode>transaction = new DequeList<>();
     
        transaction.addFirst(transact1);
       transaction.addFirst(transact2);
        transaction.addFirst(transact3);
        transaction.addFirst(transact4);
        transaction.addFirst(transact5);
               
       try {
            System.out.println("Before Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove First: " + transaction.removeFirst().getElement());
            System.out.print("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + transaction.removeLast().getElement());
            System.out.print("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + transaction.removeLast().getElement());
            System.out.print("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + transaction.removeLast().getElement());
            System.out.print("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + transaction.removeLast().getElement());
            System.out.print("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + transaction.removeLast().getElement());
            System.out.print("After Remove: ");
            transaction.showDeque();
        } catch (EmptyDequeException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
