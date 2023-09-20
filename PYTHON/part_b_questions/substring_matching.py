import re

text = "Hello, my name is John. His name is Mike. Their names are Alice and Bob."
pattern = r"name"

matches = re.finditer(pattern, text)

for match in matches:
    start = match.start()
    end = match.end()
    matched_text = match.group()
    print(f"Match found at position {start} - {end}: {matched_text}")
