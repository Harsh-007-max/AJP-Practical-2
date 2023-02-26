/*Create an Applet having 2 ListBox "List1" and "List2".
Data can be added in "List1" using a TextField and and "Add Item" 
button.
 Then we can move items between two ListBoxes using 
Move to List2 and Move to List1 Buttons. */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class prog4 extends Applet implements ActionListener{
    Label l,list2;
    List l1,l2;
    TextField tfadd;
    Button bent,Movl1,Movl2;
    public void init(){
        l = new Label("List 1:");
        l1 = new List(4, true);
        list2 = new Label("List 2:");
        l2 = new List(4,true);
        tfadd = new TextField("Enter Item");
        bent = new Button("Add Item");
        bent.addActionListener(this);
        Movl1 = new Button("Move to List 1");
        Movl1.addActionListener(this);
        Movl2 = new Button("Move to List 2");
        Movl2.addActionListener(this);
        add(l);
        add(l1);
        add(list2);
        add(l2);
        add(tfadd);
        add(bent);
        add(Movl1);
        add(Movl2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bent){
            l1.add(tfadd.getText());
        }else if(e.getSource() == Movl1){
            if(l1.getItemCount()>0){
                if(l2.getSelectedItem() !=""){
                    l1.add(l2.getSelectedItem());
                    l2.remove(l2.getSelectedItem());
                }
            }
        }else if(e.getSource()==Movl2){
            if(l1.getItemCount()>0){
                if(l1.getSelectedItem() !=""){
                    l2.add(l1.getSelectedItem());
                    l1.remove(l1.getSelectedItem());
                }
            }
        }
    }
}
//<applet code="prog4.class" width=400 height =400 ></applet>