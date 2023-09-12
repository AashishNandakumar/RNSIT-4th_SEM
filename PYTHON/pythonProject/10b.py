import json


def fetch_and_format_weather(json_file):
    try:
        with open(json_file, 'r') as file:
            data = json.load(file)

        temperature = data['main']['temp']
        humidity = data['main']['humidity']
        weather_description = data['weather'][0]['description']

        print(f"Current temperature: {temperature: .2f} Celsius")
        print(f"Humidity: {humidity}%")
        print(f"weather description: {weather_description}")

    except FileNotFoundError:
        print(f"file {json_file} does not exist")
    except KeyError:
        print("JSON file does not contain the expected weather")


json_file_path = "WeatherDataDemo/weather_data.json"
fetch_and_format_weather(json_file_path)
