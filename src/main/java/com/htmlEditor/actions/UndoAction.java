package main.java.com.htmlEditor.actions;

import main.java.com.htmlEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {

    private View view;

    public UndoAction(View view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }
}
