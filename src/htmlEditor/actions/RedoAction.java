package htmlEditor.actions;

import htmlEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {

    private View view;

    public RedoAction(View view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        view.redo();
    }
}
