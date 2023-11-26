'''
Created on 26 лист. 2023 р.

@author: User
'''

class Scanner: 
    def __init__(self, brand, model, resolution, color_mode, document_feeder): 
        self._brand = brand 
        self._model = model 
        self._resolution = resolution 
        self._color_mode = color_mode 
        self._document_feeder = document_feeder 
 
    # Get methods 
    def get_brand(self): 
        return self._brand 
 
    def get_model(self): 
        return self._model 
 
    def get_resolution(self): 
        return self._resolution 
 
    def get_color_mode(self): 
        return self._color_mode 
 
    def get_document_feeder(self): 
        return self._document_feeder 
 
    # Set methods 
    def set_brand(self, brand): 
        self._brand = brand 
 
    def set_model(self, model): 
        self._model = model 
 
    def set_resolution(self, resolution): 
        self._resolution = resolution 
 
    def set_color_mode(self, color_mode): 
        self._color_mode = color_mode 
 
    def set_document_feeder(self, document_feeder): 
        self._document_feeder = document_feeder 
 
    def get_info(self): 
        print(f"Brand: {self._brand}") 
        print(f"Model: {self._model}") 
        print(f"Resolution: {self._resolution}") 
        print(f"Color Mode: {self._color_mode}") 
        print(f"Document Feeder: {self._document_feeder}") 