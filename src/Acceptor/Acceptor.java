package Acceptor;

import Visitor.Recipe;

public abstract class Acceptor{

    protected String filename;

    public Acceptor(String filename) {
        this.filename = filename;
    }

    public String getFilename(){
        return this.filename;
    }

    public abstract void accept(Recipe recipe);
    
}