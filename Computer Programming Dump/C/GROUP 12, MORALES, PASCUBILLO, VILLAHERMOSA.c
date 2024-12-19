#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

int main()
{
	/*Starting Variables*/
	int genre;
	int date;

	/*Integer value to string converted variable*/
	char* selectedGenre;

	/*Bool(True/False)*/
	int confirmation;

	/*Start of Actual Program*/
	printf("What genre is your movie? please select from below:\n1 - Action\n2 - Drama\n3 - Sci-Fi\n\n\n");
	scanf("%d", &genre);
	system("cls");

	/*Uses integer value to search for genre and assigns string to selectedGenre variable*/
	switch (genre)
	{
	case 1:
		printf("Great! Your selected Genre is Action! What is the Release Date of this Movie?\n2018\n2019\n2020");
		selectedGenre = "Action";
		break;
	case 2:
		printf("Great! Your selected Genre is Drama! What is the Release Date of this Movie?\n2018\n2019\n2020");
		selectedGenre = "Drama";
		break;
	case 3:
		printf("Great! Your selected Genre is Sci-Fi! What is the Release Date of this Movie?\n2018\n2019\n2020");
		selectedGenre = "Sci-Fi";
		break;
	default:
		printf("Invalid choice! The Program will close in 3 seconds!");
		Sleep(3000);
		exit(0);
		break;
	}
	printf("\n\n\n");
	scanf("%d", &date);
	system("cls");

	/*Date Query & Input verification*/
	switch (date)
	{
	case 2018:
		printf("So your Movie Genre is %s and its Release Date is %d? Please Press 1 to confirm", selectedGenre, date);
		break;
	case 2019:
		printf("So your Movie Genre is %s and its Release Date is %d? Please Press 1 to confirm", selectedGenre, date);
		break;
	case 2020:
		printf("So your Movie Genre is %s and its Release Date is %d? Please Press 1 to confirm", selectedGenre, date);
		break;
	default:
		printf("Invalid choice! The Program will close in 3 seconds!");
		Sleep(3000);
		exit(0);
		break;
	}
	printf("\n\n\n");
	scanf("%d", &confirmation);
	system("cls");

	/*Movie List*/
	if (confirmation == 1)
	{

		if (selectedGenre == "Action")
		{

			if (date == 2018)
			{
				printf("Black Panther\nMission: Impossible\nAvengers: Infinity War");
			}
			if (date == 2019)
			{
				printf("John Wick: Chapter 3 - Parabellum\nSpider-Man: Far From Home\nFast & Furious Presents: Hobbs & Shaw");
			}
			if (date == 2020)
			{
				printf("Tenet\nExtraction\nThe Old Guard");
			}
		}

		if (selectedGenre == "Drama")
		{
			if (date == 2018)
			{
				printf("A Star Is Born\nThe Favourite\nBohemian Rhapsody");
			}
			if (date == 2019)
			{
				printf("Joker\nMarriage Story\nThe Irishman");
			}
			if (date == 2020)
			{
				printf("1917\nNomadland\nThe Trial of the Chicago 7");
			}
		}

		if (selectedGenre == "Sci-Fi")
		{
			if (date == 2018)
			{
				printf("Annihilation\nReady Player One\nA Quiet Place");
			}
			if (date == 2019)
			{
				printf("Star Wars\nAd Astra\nAlita: Battle Angel");
			}
			if (date == 2020)
			{
				printf("The Invisible Man\nPalm Springs\nThe Midnight Sky");
			}
		}
	}
	else
	{
		system("cls");
		printf("The Program will now close in 3 seconds! Thanks for using!");
	}

	return 0;
}
