// Showcasing ATM transactions using menu driven program
//the time complexity of the program is o(1).
#include <stdio.h>
#include <conio.h>
int main ()
{
  int card_number, choice;
  float amount = 3000.00, withdraw=0.0, deposit, new_amount=0;
  char password;
  
  printf(" INSERT YOUR ATM CARD : ");
  printf("\n\n");
  printf(" Enter the Password: ");
  scanf("%s", &password);

  printf("\n\t***********************************");
  printf("\n\t*           MENU                  *");
  printf("\n\t*     1. Check Balance            *");
  printf("\n\t*     2. Withdraw                 *");
  printf("\n\t*     3. Deposit                  *");
  printf("\n\t*     4. Exit                     *");
  printf("\n\t*                                 *");
  printf("\n\t***********************************");
  printf("\n\n");
S:
  printf("\n Enter your choice: ");
  scanf("%d", &choice);
  if (choice == 1)
  {
    printf(" Current balance on your account: %f\n", amount);
    goto S;
  }
  else if (choice == 2)
  {
    printf(" Enter the amount you want to withdraw: ");
    scanf("%f",&withdraw);
    if (withdraw>amount)
    {
      printf(" \n You don't have sufficient balance\n ");
      goto S;
    }
    else
    {
      amount = amount - withdraw;
      printf(" \n Current balance on your account: %f\n",amount);
      goto S;
    }
  }
  else if (choice == 3)
  {
    printf(" \n Enter the amount you want to deposit: ");
    scanf("%f", &deposit);
    amount = amount + deposit;
    printf(" \n Current balance on your account: %f\n", amount);
    goto S;
  }
  else if (choice == 4)
  {
    printf(" \n Thank you for using our service\n\n");
    getch();
  }
  else
  {
    printf(" \n Enter correct Choice and Try Again \n\n");
    goto S;
  }

  getch();
  return 0;
}