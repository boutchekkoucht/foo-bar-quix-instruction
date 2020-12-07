import { MapType } from '@angular/compiler';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  constructor(private fooBarQuixService: FooBarQuixService) { }
  numbersConverted : NumberConverted []= [];

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    
    this.fooBarQuixService.convertInput(inputNumber).subscribe(res => {
      this.numbersConverted.push({numberToConvert: inputNumber, result: res['result']})
    })
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
