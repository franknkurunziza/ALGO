class SLLNode{
    constructor(val){
        this.val=val;
        this.next=null;
    }
}

class SLL{
    constructor(){
        this.head=null;
    }

    addFront(val) {
        var newNode=new SLLNode(val);
        newNode.next=this.head;
        this.head=newNode;
        return this;
    } 

    remvoveFront(){
        var curr=this.head;
        this.head=curr.next;
         return this;
    }

    frontDisplay(){
        console.log(this.head.val);
        return this;
    }

    display(){
        var runner=this.head;
        while(runner!==null){
            console.log(runner.val);
            runner=runner.next;
        }
        return this;
    }
}
var singlyLinkedList=new SLL();

singlyLinkedList.addFront(80).addFront(21).frontDisplay().remvoveFront().display();

// console.log(singlyLinkedList.remvoeFront())
