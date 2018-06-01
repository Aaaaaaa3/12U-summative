/**
 * Tasha Xiao, Julia Zhao 
 * Character dialogue
 * VisualNovel.java
 */

//import the libraries
import java.util.Scanner;
import java.io.*;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class VisualNovel extends JFrame implements ActionListener{
  
  JFrame f = new JFrame();
  JButton nextButton = new JButton ("Next");
  JLabel textLabel = new JLabel("~Sample text 1~");
  JLabel nameLabel = new JLabel("Name");
  ImageIcon bgImage = new ImageIcon("IMAGE.jpg");
  ImageIcon image = new ImageIcon("dialogue1.png");
  JLabel bg = new JLabel(bgImage);
  JLabel imageLabel = new JLabel(image);
  File file = new File ("text.txt");
  Scanner fileInput;
  
  //start of constructer
  public VisualNovel() 
  { 
    f.setTitle("");
    f.setSize(800,600);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.setLayout(null);
    f.setLocationRelativeTo(null);
    
    //add the images (imageLabel on top of bg)
    setContentPane(bg);
    imageLabel.setBounds(-3,0,800,600);
    f.add(imageLabel);
    
    //create a new font(I included it in the folder so go install it (if possible)for the full experience!!!!)
    Font dosis = new Font ("Dosis Light", Font.PLAIN, 21);
    
    //adjusting the font and colour of the text label
    textLabel.setFont(dosis);
    textLabel.setBounds(30, 270, 700, 400);
    textLabel.setForeground (Color.BLACK);
    f.add(textLabel);
    
    nameLabel.setFont(dosis);
    nameLabel.setBounds(20,214,700,400);
    nameLabel.setForeground(Color.BLACK);
    f.add(nameLabel);
    
    //add skipButton and nextButton
    
    nextButton.setBounds(670,520,70,30);
    f.add(nextButton);
    nextButton.addActionListener(this);
    
    try {fileInput = new Scanner(file);}
    catch (FileNotFoundException e ){System.out.println("File not found");}
  }//end of constructer 
  
  public void actionPerformed (ActionEvent event)
  {
    String temp = "";
    try{
      //set the next lines
      temp = fileInput.nextLine();
      nameLabel.setText(temp.substring(0, temp.indexOf(" ")));
      textLabel.setText(temp.substring(temp.indexOf(" ")+1));
    }
    catch(Exception E){
    //when there aren't anymore lines, get rid of this
      f.dispose();
    }

  }//end of action listening 
  
  public static void main(String[] args) 
  { 
    new VisualNovel();
  }//end of main
  
}//end of class