import { Component, OnInit } from '@angular/core';
import { UppercaseService } from '../service/uppercase.service';

@Component({
  selector: 'app-converter',
  templateUrl: './converter.component.html',
  styleUrls: ['./converter.component.css']
})
export class ConverterComponent implements OnInit {
 
 
  upperName:String;
  constructor(public service:UppercaseService  ) {
 
     
   }
converttext(txttext:HTMLInputElement){
this.upperName=this.service.convertupper(txttext.value);
}
convert(txttext:HTMLInputElement){
this.upperName=this.service.convertlower(txttext.value);

}

  
  ngOnInit() {
  }

}
