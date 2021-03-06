/*
 * Created on 07/12/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/*
 * @author 
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
 
 /*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
*                         
*                        class runRnaMute
*	this file is  responsible for the gui application
*  
*
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import java.util.*;
import java.io.*;

public class runRnaMute extends javax.swing.JFrame {
	

    private javax.swing.JButton resetButton; // the button "reset" - cleans the sequence box
    private javax.swing.JButton resultButton;//the button "result" - opens the reults that were generated by clicking 'start'
    private javax.swing.JScrollPane resultScrollPane;//
    private javax.swing.JTextArea resultTextArea;//the box for the sequence - needed to be inserted by the user
    private javax.swing.JButton startButton;//the buttom "start" - begins the operation on the inserted sequence
    private javax.swing.JButton headButton; //a buttom which opens the ReadMe.html file for extra information 
    private javax.swing.JTextField tryMe;
    private final JTextField J_1 = new JTextField(  );//box for Clustering Resolution
    private final JTextField J_2 = new JTextField(  );//box for Clustering Resolution
    // End of variables declaration//GEN-END:variables
   
    /** Initializes the applet RNAmute*/
    public void init() {
        initComponents();
        resultTextArea.setFont(new java.awt.Font("Courier New",java.awt.Font.PLAIN, 14));
        setSize(500,300);
    }
    
    private void initComponents() {
    	java.awt.GridBagConstraints gridBagConstraints;
    	resultScrollPane = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        headButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        tryMe = new javax.swing.JTextField();
        
        getContentPane().setLayout(new java.awt.GridBagLayout());
        //***************************//
       
        headButton.setText("Please insert your sequence (for more details click here)");
        headButton.setFont(new java.awt.Font("Times New Roman",java.awt.Font.BOLD, 14));
        headButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 12);
        getContentPane().add(headButton, gridBagConstraints);
         //*****************************///  

        resultTextArea.setColumns(20);
        resultTextArea.setMargin(new java.awt.Insets(4, 4, 4, 4));
        resultScrollPane.setViewportView(resultTextArea);

        //getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 12, 6);
        getContentPane().add(resultScrollPane, gridBagConstraints);
        //***************************//
        
        startButton.setText(" Start ");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 12);
        getContentPane().add(startButton, gridBagConstraints);
         //*****************************///     
           
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 12);
        getContentPane().add(resetButton, gridBagConstraints);
        //*****************************************//
        resultButton.setText("Result");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 12);
        getContentPane().add(resultButton, gridBagConstraints);
        
        
        
        JPanel Jump1 = new JPanel(  );
        Jump1.add( new JLabel( "     Shapiro's Representation:" ) );
    	J_1.setColumns( 2 ); 
    	J_1.setText( "6" );
        J_1.setMargin(new java.awt.Insets(2, 2, 2, 4));
        J_1.setFont(new java.awt.Font("Times New Roman",java.awt.Font.PLAIN, 14));
      	Jump1.add( J_1 );
        JPanel Jump2 = new JPanel(  );
        Jump2.add( new JLabel( "Dot-Bracket Representation:" ) );
    	J_2.setColumns( 2 );
    	J_2.setText( "4" );
        J_2.setMargin(new java.awt.Insets(2, 2, 2, 4));
        J_2.setFont(new java.awt.Font("Times New Roman",java.awt.Font.PLAIN, 14));
        Jump2.add( J_2 );
        JPanel arguments = new JPanel(  );
        arguments.setLayout( new BoxLayout( arguments, BoxLayout.PAGE_AXIS ) );
        arguments.setBorder( BorderFactory.createCompoundBorder( 
               BorderFactory.createTitledBorder( "Clustering Resolution" ),
               BorderFactory.createEmptyBorder( 5, 5, 5, 5 ) ) );
        arguments.setPreferredSize( new Dimension( 250, 100 ) );
        arguments.add( Jump2 );
        arguments.add( Jump1 );
         
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(arguments, gridBagConstraints);
        
         //*****************************///  
        
    } //init()
      
        
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resultTextArea.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed
    
    
    
    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        try{	
				Process p = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", "webclient-kde RESULT_TABLE.html &"});	
		        p.waitFor(); 
			}
			catch (Exception e){System.out.println(e);}
    }//GEN-LAST:event_resultButtonActionPerformed
 
    private void headButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        try{	
				Process p = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", "webclient-kde ReadMe.htm &"});	
		        p.waitFor(); 
			}
			catch (Exception e){System.out.println(e);}
        
    }//GEN-LAST:event_headButtonActionPerformed
 
 
 
    public void  startButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	boolean is_ok = false;
    	try {
	    	 File file = new File("seq.txt");//creates a new file called seq.txt that will hold the sequence
	    	 FileWriter fw = new FileWriter(file);
	         String str = resultTextArea.getText();
	         String temp_str = str.trim();
        	 str = temp_str;
	         is_ok = checkText(str);//checkes if the sequence inserted into the box is ok(consist of A,G,U/T,C)
			 fw.write(str);//writes the sequence in the file
	         fw.close();
	         
		     File file2 = new File("Clustering Resolution.txt");//updates Clustering Resolution.txtwith the new values according
	    	 FileWriter fw2 = new FileWriter(file2);            // to the numbers inserted by the user in the relevant boxes	
	         String str2 = J_1.getText();
	         String temp_str2 = str2.trim();
        	 str2 = temp_str2;
        	 String str3 = J_2.getText();
	         String temp_str3 = str3.trim();
        	 str3 = temp_str3;
			 fw2.write(str2+ " " + str3);
	         fw2.close();
	         
		}
        catch(java.io.IOException e){}
        if (is_ok){				
			try{//calls to mute_single with the file seq.txt which holds the seq.this process creates a result.txt file	
				Process p = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", "bin/mute_single < seq.txt "});	
				
		        p.waitFor(); 
			}
			catch (Exception e){System.out.println(e);}
			
			ProcessResult pr = new ProcessResult();//a call to ProcessResult which handles the file
			pr.go();							   //result.txt that was generated by the last process	   
		}
	    else {
	    	//if the input of the sequence was not valid, an output file "RESULT_TABLE.html" 
	        //that contains the folowing infomation will be created.
	    	try{
		        File main_file= new File("RESULT_TABLE.html");	
		    	FileWriter out = new FileWriter(main_file);
		    	out.write("<html><head><title>Error</title></head><body bgcolor=#99ccff> "+
		    			  "Error: ileagal input.<p>please check it and try again.<p>"+
		    			  "remember : use only U,G,C,T,A or u,g,c,t,a <p>" + 
		    			  " and don't use spaces.</body></html>");
	    		out.close(); 
	    	}
	    	catch (Exception e){System.out.println(e);}       
    		
    	}
    	delete_unneccesery_files();// cleans the home directory from files that were created doring the run  	
    		
    }  
        
     private void saveTextFile(File file, String str) throws java.io.IOException, java.io.FileNotFoundException{
        boolean finished = false;
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.StringReader(str));
        java.io.PrintWriter out = new java.io.PrintWriter(
                new java.io.BufferedWriter(
                        new java.io.FileWriter(file)));
        
        while(!finished) {
            String line = in.readLine();
            if (line == null) finished = true;
            else out.println(line);
        }
        out.close();
    }
    
   public static boolean checkText(String str){
   	boolean ans = true;
   	for (int i =0; i <str.length(); i++){
   		if (str.charAt(i) !='A' && str.charAt(i)!='T'&& str.charAt(i)!='U'&& str.charAt(i)!='C'&&str.charAt(i)!='G'
   		&&str.charAt(i) !='a' && str.charAt(i)!='t'&& str.charAt(i)!='u'&& str.charAt(i)!='c'&&str.charAt(i)!='g') 
   			return  false;
   	 }	
	   return ans;
 }
  
	
	
	public static void delete_unneccesery_files(){
		try{
    		File foo_file= new File("foo_file.ct");
    		foo_file.delete();	
    	 	
    	    File mut= new File("mut");
    		mut.delete();	
    		
    		File our_sequence= new File("our_sequence");
    		our_sequence.delete();	
    		
    		
    		File our_sequence_txt= new File("our_sequence.txt");
    		our_sequence_txt.delete();	
    		
    		
    		File result= new File("result");
    		result.delete();		
    		
    		File seq= new File("seq");
    		seq.delete();
    		
    		File temporary= new File("temporary.txt");
    		temporary.delete();	
    		
    		File temporary1= new File("temporary1.txt");
    		temporary1.delete();
    		
    		File rna= new File("rna.ps");
    		rna.delete();	
    		
    		File jumps= new File("Clustering Resolution.txt");
    		String jumps_str = "6 4";
    		FileWriter fwj = new FileWriter(jumps);
    		fwj.write(jumps_str);
    		fwj.close();
	       
    			
    		
    			
    	}
    	catch (Exception e){System.out.println(e);}  
		
	}
	
	public static void main (String [] args ){
		runRnaMute frame = new runRnaMute();
		frame.init();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("RNAmute");
		frame.setVisible(true);
		
		
	}
	
}
