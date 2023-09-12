import PyPDF2


# select pages from multiple pdfs and merge them into a single one
def combine_pdfs(input_pdfs, output_pdf, pages_to_extract):
    pdf_writer = PyPDF2.PdfWriter()

    # go through the input pdfs one by one
    for pdf in input_pdfs:
        pdf_reader = PyPDF2.PdfReader(pdf)

        # iterate over the pages of the current pdf
        for page in pages_to_extract:
            if 0 < page <= len(pdf_reader.pages):
                res_page = pdf_reader.pages[page-1]
                pdf_writer.add_page(res_page)

    with open(output_pdf, "wb") as out_file:
        pdf_writer.write(out_file)


input_pdfs = ['i1.pdf', 'i2.pdf', 'i3.pdf']
output_pdf = 'combined_output.pdf'
pages_to_extract = [1, 2, 3]

combine_pdfs(input_pdfs, output_pdf, pages_to_extract)

print(f"Selected pages combined and saved to {output_pdf}")
