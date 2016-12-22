/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 18.12.2016
 * Time: 22:52:30
 * To change this template use File | Settings | File Templates.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Notepad {


    private String currentUser = "Anonymous";
    private int size;
    private int capacity;
    private Note[] elements;


    public Notepad() {
        this.currentUser = "Anonymous";
        this.size = 0;
        this.capacity = 16;
        this.elements = new Note[this.capacity];
    }

    /**
     *  Allows the user to choose from available options.
     */
    public void chooseOption(){
        Scanner scanner = new Scanner( System.in );
        String s;
        while(true){
            System.out.println("<A>dd | <D>elete | <E>dit | <V>iew all | <C>hange user |<Q>uit");
            s = scanner.nextLine().toLowerCase();
            if (s.equals("a")||s.equals("add")){
                optionAdd();
            }
            if (s.equals("d")||s.equals("delete")){
                if (0 == size){
                    System.out.println("No notes to delete");
                } else {
                    optionDelete();
                }
            }
            if (s.equals("e")||s.equals("edit")){
                if (0 == size){
                    System.out.println("No notes to edit");
                } else {
                    optionEdit();
                }
            }
            if (s.equals("v")||s.equals("view")||s.equals("view all")){
                optionViewAll();
            }
            if (s.equals("c")||s.equals("change")||s.equals("change user")){
                System.out.println("Current user: " + currentUser + ".");
                System.out.println("Enter new name:");
                s = scanner.nextLine();
                currentUser = s.trim();

            }
            if (s.equals("q")||s.equals("quit")){
                break;
            }
        }
    }


    /**
     *  Option to add a new entry. User must enter the text, which he wants to store in the Notepad.
     */
    private void optionAdd (){
        Note newNote = new Note();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Scanner scanner = new Scanner( System.in );
        String s;
        newNote.noteID = Note.id++;
        newNote.author = currentUser;
        newNote.date = dateFormat.format(Calendar.getInstance().getTime());
        System.out.println("Type text, <Enter> to proceed");
        s = scanner.nextLine();
        newNote.text = s;
        add(newNote);
    }


    /**
     *  Option to delete an entry. User must enter the correct index of the entry to delete.
     */
    private void optionDelete (){
        System.out.println("Write index of the note to delete or \"<C>ancel\" to return");
        Scanner scanner = new Scanner( System.in );
        String s;

        while(true){
            s = scanner.nextLine().toLowerCase();
            if (s.equals("c")||s.equals("cancel")){
                break;
            }
            if (isCorrectIndex(s)){
                remove(Integer.parseInt(s));
                break;
            } else{
                System.out.println("Incorrect index. Write correct index of the note to delete or \"<C>ancel\" to return");
            }
        }
    }

    /**
     *  Option to edit an entry. User must enter the correct index of the entry to edit.
     */
    private void optionEdit (){
        System.out.println("Write index of the note to edit or \"<C>ancel\" to return");
        Scanner scanner = new Scanner( System.in );
        String s;

        while(true){
            s = scanner.nextLine().toLowerCase();
            if (s.equals("c")||s.equals("cancel")){
                break;
            }
            if (isCorrectIndex(s)){
                edit(Integer.parseInt(s));
                break;
            } else{
                System.out.println("Incorrect index. Write correct index of the note to delete or \"<C>ancel\" to return");
            }
        }
    }

    /**
     *  Displays all entries' text and information, 3 at a time.
     */
    private void optionViewAll (){
        Scanner scanner = new Scanner( System.in );
        for (int i = 0; i < size; ++i){
            writeNote(i);
            if (i%3 == 2 && i != size - 1){
                System.out.println("Press <Enter> to continue.");
                scanner.nextLine();
            }
        }
    }

    /**
     *  Doubles list's capacity.
     */
    public void increaseCapacity(){
        capacity *= 2;
        Note[] oldData = elements;
        elements = new Note[capacity];
        System.arraycopy(oldData, 0, elements, 0, size);
    }

    /**
     * Displays entry's index, id, author, time when last edited, and the text.
     * @param index  an index of the entry to display
     */
    private void writeNote (int index){
        System.out.println("No " + index  + ", id " + elements[index].noteID);
        System.out.println("Author: " + elements[index].author);
        System.out.println("Last edited: " + elements[index].date);
        System.out.println("    " + elements[index].text);
        System.out.println();
    }


    /**
     * Finds index of an element with required id value.
     * @param id  required id value
     * @return    index of an element with required id or -1 if no element is found
     */
    private int getByID(int id){
        for (int i = 0; i < size; ++i){
            if (elements[i].noteID == id){
                return i;
            }
        }
        return -1;
    }

    /**
     * Adds a new entry to the list and doubles capacity if the list is full.
     * @param value  entry to add
     */
    public void add(Note value){
        if (capacity >= size){
            increaseCapacity();
        }
        elements[size++] = value;
    }

    /**
     * Deletes an entry with specified id, if such entry exists.
     * @param id  id of the entry to delete
     */
    public void remove(int id){
        int index = getByID(id);
        if (0 <= index && index < size){
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[--size] = null;
            System.out.println("Note No " + index + " is removed.");
        } else {
            System.out.println("No note with such index.");
        }
    }

    /**
     * Replaces text of an entry with specified id with user's input. Updates "author" and "date" fields.
     * @param id  id of the entry to edit
     */
    public void edit(int id){
        int index = getByID(id);
        if (0 <= index && index < size){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Scanner scanner = new Scanner( System.in );
            String s;
            System.out.println("Editing following note:");
            writeNote(index);
            System.out.println("Write new text:");
            s = scanner.nextLine();
            elements[index].text = s;
            elements[index].author = currentUser;
            elements[index].date = dateFormat.format(Calendar.getInstance().getTime());
            System.out.println("Note No " + index + " edited. Current state:");
            writeNote(index);
        } else {
            System.out.println("No note with such index.");
        }
    }

    /**
     * Checks if an index exists in the list
     * @param s  a String with index
     * @return   "true" if an index exists, otherwise "false"
     */
    private boolean isCorrectIndex(String s){
        int length = s.length();
        if (0 == length){
            return false;
        }
        if ('0' == s.charAt(0) && length > 1){
            return false;
        }
        for (int i = 0; i < length; ++i){
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
