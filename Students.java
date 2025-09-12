class  Students{
    public static void main(String [] args){
        int [] marks = {100, 44, 55, 44, 23, 44, 55};

        for(int i=0; i<marks.length; i++){
            if(marks[i]<35)
            System.out.println(marks[i] + " ");
        }
    }
}