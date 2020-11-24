package edu.jeffstate.objects;

public class Link {
    protected Link(INode src, INode dest){
        this.SourceNode = src;
        this.DestinationNode = dest;
    }
    
    // Nodes Link connects
    private INode SourceNode, DestinationNode;
    
}
