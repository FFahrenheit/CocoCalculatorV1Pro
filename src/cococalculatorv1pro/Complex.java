/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cococalculatorv1pro;

/**
 *
 * @author ivan_
 */
public class Complex 
{
    private Double real;
    private Double imaginary;
    
    Complex()
    {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    
    Complex(double r, double i)
    {
        this.real=r;
        this.imaginary=i;
    }
    
        public Double getReal() 
    {
        return real;
    }

    public void setReal(Double real) 
    {
        this.real = real;
    }

    public Double getImaginary() 
    {
        return imaginary;
    }

    public void setImaginary(Double imaginary) 
    {
        this.imaginary = imaginary;
    }
    
    public Complex add(Complex a, Complex b)
    {
        return new Complex(a.getReal()+b.getReal(),a.getImaginary()+b.getImaginary());
    }
    
    @Override
    public String toString()
    {
        String complement;
        if(this.imaginary>0)
        {
            complement = "+"+imaginary+"i)";
        }
        else
        {
            complement = "-"+imaginary+"i)";
        }
        return "("+this.real+complement;
    }

    public Complex subtract(Complex a, Complex b) 
    {
        return new Complex(a.getReal()-b.getReal(),a.getImaginary()-b.getImaginary());
    }
    
    public Complex multiply(Complex a, Complex b)
    {
        return new Complex(a.getReal()*b.getReal()-a.getImaginary()*b.getImaginary(),a.getReal()*b.getImaginary()+b.getReal()*a.getImaginary());
    }
}
