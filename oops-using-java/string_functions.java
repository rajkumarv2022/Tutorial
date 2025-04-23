class main{
    
    public static void main(String[] args)
    {
        
        StringBuffer str = new StringBuffer("Hello");
        
        System.out.println(str);
        
        System.out.println(str.capacity());
        
        str.append("Hii");
        
        System.out.println(str);
        
        str.insert(2,'H');
        
        System.out.println(str);
        
        str.replace(1,3,"JJJ");
        
        System.out.println(str);
        
        str.insert(6,"ZZZ");
        
        System.out.println(str);
        
        str.delete(1,3);
        
        System.out.println(str);
        
        System.out.println(str.reverse());
        
        str.setCharAt(4,'i');
        
        System.out.println(str);
        
        str.ensureCapacity(100);
        
        System.out.println(str.capacity());
        
        System.out.println(str.length());
        
        str.setLength(20);
        
        System.out.println(str.length());
        
        System.out.println(str.indexOf("zz"));
        
        System.out.println(!str.equals("zz"));
        
        System.out.println(str.indexOf("Ho"));
    }
    
}