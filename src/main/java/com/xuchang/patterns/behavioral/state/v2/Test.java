package com.xuchang.patterns.behavioral.state.v2;


public class Test {
    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
