package view;

import controller.Controller;
import listeners.FrameListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
    public Controller getController() {
        return controller;
    }
    public void init() {
        initGui();
        addWindowListener(new FrameListener(this));
        this.setVisible(true);
    }
    public void exit(){
        controller.exit();
    }
    public void initMenuBar(){

    }
    public void initEditor(){}
    public void initGui(){}

    public void selectedTabChanged() {
    }
}
