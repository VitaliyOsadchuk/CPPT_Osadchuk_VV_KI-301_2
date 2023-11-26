'''
Created on 26 лист. 2023 р.

@author: User
'''

import math 
 
class Equation: 
    def calculate(self,x): 
        rad = x * math.pi / 180.0 
        try: 
            
        #  y=tg(x)/(sin(4x) – 2cos(x)) 
        
            y = math.tan(x)/(math.sin(4*x)-2*math.cos(x)) 
            if rad == math.pi or rad == (math.pi * 2) or rad == (math.pi/2) or rad == (3*math.pi/2): 
                raise Exception 
        except Exception as e: 
            print("Exeption: illegal value ",str(e)) 
            return 0 
        return y