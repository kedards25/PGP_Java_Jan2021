import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';


@NgModule({
  //User-defined components will be injected here
  declarations: [
    AppComponent
  ],

  //system/pre-defined modules will be imported here
  imports: [
    BrowserModule
  ],

  //Services that will communicate with REST API will be injected here
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
