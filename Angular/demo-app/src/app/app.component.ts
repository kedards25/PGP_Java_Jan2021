import { Component } from '@angular/core';

@Component({
  selector: 'demo-root',
  templateUrl: './app.component.html',
  // template:`<h2>{{title}}</h2>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  //interpolation: displaying values from typescript into html
  title = 'Welcome to my app';
}
