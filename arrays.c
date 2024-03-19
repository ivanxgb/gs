#include <stdio.h>

int main(int argc, char *argv[])
{

    int ar[] = {30, 23, 11};

    printf("%p \n", &ar);

    printf("Dirección del primer elemento: \n %p\n", &ar[0]);
    printf("Dirección del segundo elemento \n %p\n", &ar[1]);
    printf("Dirección del tercer elemento \n %p\n", &ar[2]);

    char a[] = {'H', 'o', '\0'};


    printf("%s", a);

    return 0;
}

/**

    238 239 23a 23b 23c 23d 23e 23f 240
     -  -   -   -    |   |   |   |   +

*/
