import zipfile
import os

folder_path = input("Enter the folder path to be zipped: ")
output_zip_file = input("Enter the name of the output zip file: ")

try:
    with zipfile.ZipFile(output_zip_file, 'w', zipfile.ZIP_DEFLATED) as zipf:
        for root, dirs, files in os.walk(folder_path):
            for file in files:
                file_path = os.path.join(root, file)
                arcname = os.path.relpath(file_path, folder_path)
                zipf.write(file_path, arcname=arcname)
    print(f"ZIP file '{output_zip_file}' created successfully")
except FileNotFoundError:
    print(f"Folder '{folder_path}' not found")

