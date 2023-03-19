package Visitor;

import Acceptor.Acceptor;

public interface Recipe {
    void visit(Acceptor ChangeHtml);
}
