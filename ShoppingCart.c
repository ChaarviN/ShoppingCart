#include <stdio.h>
#include <string.h>
int main () {
    
    char item[50] = "";
    float price, total, quantity;
    char currency = '$';
    
    printf("What item would you like to buy? ");
    fgets(item, 50, stdin);
    item[strlen(item) - 1] = '\0';
    
    printf("What is the price of each item? ");
    scanf("%f", &price);

    printf("How many would you like to buy? ");
    scanf("%f", &quantity);

    total = price*quantity;

    printf("You have bought %f %s/s\n", quantity, item);
    printf("Your total is %c%.2f", currency, total);

    return 0;
}