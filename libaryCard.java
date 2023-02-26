/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class libaryCard {
    public long lbCode;
    public String owner;
    public int borrowCount;
 
    /**
     *
     */
//    public libaryCard(){ 
//    
//}
//public libaryCard(long lbCode, String owner, int borrowCount){
//   this.lbCode = lbCode;
//   this.owner = owner;
//   this.borrowCount = borrowCount;
//}
    
public libaryCard(long lbCode, String owner, int borrowCount){
    this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
}

    public void setLbCode(long lbCode) {
        this.lbCode = lbCode;
    }
public void setOwner(String owner){
    this.owner = owner;
}
public void setBorrowCount(int borrowCount){
    this.borrowCount = borrowCount;
}
public String getOwner(){
    return owner;
}
public long getLbCode(){
    return lbCode;
}
public int getBorrowAcount(){
    return borrowCount;
}

    /**
     *
     * @return
     */
    @Override
    public String toString(){
    return lbCode +""+ owner +""+ borrowCount;
}
    
    }
    /**
     * @param args the command line arguments
     */
    




         


