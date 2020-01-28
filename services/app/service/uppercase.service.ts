import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class UppercaseService {
   convertupper(str:string ): String
  {
 return str.toUpperCase();
  }
 convertlower(str:string ): String
  {
 return str.toLowerCase();
  }
  constructor() {

    
  }
}
