'''
Created on 26 лист. 2023 р.

@author: User
'''

from copier import Scanner, Copier 
scanner = Scanner("Epson", "ScanMaster 2000", "1200x1200 dpi", "Black and White", True) 
scanner.get_info() 
print("--------------------------------------------------") 
scanner.set_model("Scan Master 9000") 
scanner.set_resolution("1999x1999 dpi") 
scanner.get_info() 
print("--------------------------------------------------") 
copier = Copier("Canon", "CopyPro 3000", "600x600 dpi", "Color", True, "30 pages per minute", "250 sheets") 
copier.get_info() 
print("--------------------------------------------------") 
copier.set_paper_capacity("500 sheets") 
copier.set_color_mode("CMYK") 
copier.get_info() 
print("--------------------------------------------------") 