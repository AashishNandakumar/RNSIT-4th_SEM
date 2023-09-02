/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <pthread.h>

void *new_thread(void *thread_args)
{
    int i, j;
    for (j = 0; j < 5; j++)
    {
        printf("Hello world\n");
        for (i = 0; i < 10000; i++)
            ;
    }
    return NULL;
}

int main()
{
    int i, j;
    pthread_t tcb;
    if (pthread_create(&tcb, NULL, new_thread, NULL))
    {
        printf("Error creating a new thread\n");
        return -1;
    }
    for (j = 0; j < 5; j++)
    {
        printf("Hello i am in main thread\n");
        for (i = 0; i < 10000; i++)
            ;
    }

    if (pthread_join(tcb, NULL))
    {
        printf("Error in joining thread!\n");
        return -1;
    }

    return -1;
}
