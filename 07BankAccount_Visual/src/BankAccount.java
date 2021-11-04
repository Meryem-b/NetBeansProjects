public class BankAccount   {
  private double CurrentAmount;          
  private double lowerLimit;      

  public BankAccount()    {
    CurrentAmount = lowerLimit = 0.00;
  }

  public BankAccount(double bky, double  altLmt)   {
    CurrentAmount = bky;
    set_LowerLimit ( altLmt );
  }

  public void setBalance(double bky)    {
    CurrentAmount = bky;
  }
  
  public double getBalance()    {
    return CurrentAmount;
  }

  public boolean money_Withdrawal( double money )   {
    if ( CurrentAmount - money >= lowerLimit )   {
            CurrentAmount = CurrentAmount - money;
            return true;   }
    else
            return false;
  }

  public void money_Deposit( double money )   {
    CurrentAmount = CurrentAmount + money;
  }

  public void set_LowerLimit( double money )   {
      if ( money > 0 )
           lowerLimit = -money;
      else
           lowerLimit = money;
  }

  public double get_LowerLimit ( )   {
    return lowerLimit;
  }
}