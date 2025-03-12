/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author jaden
 */
class Pwr { 
  double b; 
  int e; 
  double val; 
 
  Pwr(double base, int exp) { 
    this.b = base; 
    this.e = exp; 
 
    this.val = 1; 
    if(exp==0) return; 
    for( ; exp>0; exp--) this.val = this.val * base; 
  } 
 
  double get_pwr() { 
    return this.val; 
  } 
}