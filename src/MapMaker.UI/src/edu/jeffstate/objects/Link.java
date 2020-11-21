package edu.jeffstate.objects;

public class Link {
    public Link(INode src, INode dest){
        this._srcNode = src;
        this._desNode = dest;
    }
    
    // Nodes Link connects
    private INode _srcNode, _desNode;
    
}
