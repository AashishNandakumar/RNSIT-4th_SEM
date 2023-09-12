import os
import requests
from bs4 import BeautifulSoup

# create a directory to store comics
os.makedirs("DependentFilesForLab_9a", exist_ok=True)

# start the comic no
comic_num = 1

while True:
    # Construct the url for xkcd comic
    url = f'https://xkcd.com/{comic_num}/'

    # send an HTTP GET request to the URL
    response = requests.get(url)

    # check if the request was successful
    if response.status_code == 200:
        # usually response = html content in string
        soup = BeautifulSoup(response.text, 'html.parser')
        # find the comic image element
        comic_img = soup.find('div', id='comic').img

        if comic_img:
            # get the image url for the comic
            image_url = f"https:{comic_img['src']}"
            # download the comic image
            image_response = requests.get(image_url)

            if image_response.status_code == 200:
                # get the file extension from the url
                file_extension = os.path.splitext(image_url)[1]

                # save the image to the xkcd directory
                with open(f'DependentFilesForLab_9a/{comic_num}{file_extension}', 'wb') as file:
                    file.write(image_response.content)
                print(f"Downloaded comic {comic_num}")
            else:
                print(f"Failed to download comic {comic_num}")

            comic_num += 1

        else:
            print(f"Comic {comic_num} does not exist. Exiting..")
            break
    else:
        print(f"Comic {comic_num} does not exist. Exiting..")
        break

