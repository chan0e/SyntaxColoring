package File;

import Acceptor.Acceptor;
import Visitor.Recipe;

public class TFile extends Acceptor{

    public TFile(String filename) {
        super(filename);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void accept(Recipe recipe) {
        // TODO Auto-generated method stub
        recipe.visit(this);
    }
    
}
