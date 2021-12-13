public class matrix {
    int a[][];
    int row;
    int col;
      private int flag=0;
     public matrix(int row,int col){
          this.row=row;
          this.col=col;
          a=new int[row][col];
      }
      public int getElementAt(int i,int j){
           return a[i][j];
       }
      public void setElementAt(int i,int j,int v){
           a[i][j]=v;
       }
       public void findItem(int a[][],int row,int column,int item){
           for(int i=0;i<row;i++){
               for(int j=0;j<column;j++){
                   if(a[i][j]==item){
                       System.out.println("Row="+i+" "+"Column="+j);
                       flag=1;
                       break;
                   }
               }
           }
           if(flag==0){
               System.out.println("Not found");
           }
       }
       public matrix addition(matrix m,matrix m1) throws AdditionNotPossibleException{
         if(m.row==m1.row && m.col==m1.col){
             matrix m2=new matrix(m.row,m.col);
              for(int i=0;i<m.row;i++){
                  for(int j=0;j<m.col;j++){
                      m2.setElementAt(i,j,m1.getElementAt(i,j)+m.getElementAt(i,j));
                  }
              }
              return m2;
          }
          else{
              throw new AdditionNotPossibleException();
          }
       }
       void print(){
           for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                  System.out.print(a[i][j]+" ");
               }
               System.out.println();
           }
       }
   
   }