'''
Created on 26 лист. 2023 р.

@author: User
'''

from scaner import Scanner 
class Copier(Scanner): 
    def __init__(self, brand, model, resolution, color_mode, document_feeder, copy_speed, paper_capacity): 
        # визов конструктора parent класу
        super().__init__(brand, model, resolution, color_mode, document_feeder) 
        self._copy_speed = copy_speed 
        self._paper_capacity = paper_capacity 
 
    # Get methods 
    def get_copy_speed(self): 
        return self._copy_speed 
 
    def get_paper_capacity(self): 
        return self._paper_capacity 
 
    # Set methods 
    def set_copy_speed(self, copy_speed): 
        self._copy_speed = copy_speed 
 
    def set_paper_capacity(self, paper_capacity): 
        self._paper_capacity = paper_capacity 
 
    # Override -- щоб get_info включав додаткову інф 
    def get_info(self): 
        # Визов get_info з parent класу
        super().get_info() 
        # Включати додаткову інф 
        print(f"Copy Speed: {self._copy_speed}") 
        print(f"Paper Capacity: {self._paper_capacity}") 