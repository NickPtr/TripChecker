public class Odometro 
{
    int xlm;
    float katanalosi;
    float venz;
    
    public Odometro(int xlm, float katanalosi)
    {
        this.xlm=xlm;
        this.katanalosi=katanalosi;
    }
    
    public void Midenismos()
    {
        this.xlm=0;
        this.katanalosi=0;
    }
    
    public float Venzini()
    {
        venz=(this.xlm*this.katanalosi)/100;
        
        return venz;
    }
    
    public int getXlm()
    {
        return xlm;
    }
    
    public void AddXlm(int add)
    {
        this.xlm=this.xlm+add;
    }
}
