package edu.clemson.ece.leetcode.CloneGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ConcurrentModificationException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test input: {0,0,0}
		UndirectedGraphNode node = new UndirectedGraphNode(0);
		node.neighbors.add(node);
		node.neighbors.add(node);
		ConcurrentModificationException cme = new ConcurrentModificationException();
		cme.cloneGraph(node);
	}
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(null==node) return null;
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        map.put(node.label, node);
        while(!queue.isEmpty()){
            UndirectedGraphNode tmp = queue.remove();
            UndirectedGraphNode cur = map.get(tmp.label);
            for(UndirectedGraphNode n : tmp.neighbors){
                if(map.containsKey(n.label)){
                    cur.neighbors.add(map.get(n.label));
                } else {
                    UndirectedGraphNode clone = new UndirectedGraphNode(n.label);
                    cur.neighbors.add(clone);
                    map.put(clone.label, clone);
                    queue.add(clone);
                }
            }
        }
        return map.get(node.label);
    }
}
