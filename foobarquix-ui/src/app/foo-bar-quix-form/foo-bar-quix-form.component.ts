import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

  fooBarQuixForm :any;
  @Output() submitNumberOutput = new EventEmitter;

  constructor(private formBuilder: FormBuilder) {
    this.fooBarQuixForm = this.formBuilder.group({
      inputNumber:  ['', [Validators.required]],
    });
  }
  get inputNumber() {
    return this.fooBarQuixForm.get('inputNumber');
  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    if(this.fooBarQuixForm.valid) {
      console.log("log ", this.inputNumber.value)
      this.submitNumberOutput.emit(this.inputNumber.value);
    } else {
      console.log("i'm supposed to post a message in html :p")
    }
   
  }


}
