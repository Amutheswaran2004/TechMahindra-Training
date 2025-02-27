import React, { Suspense, lazy } from "react";
import Component3 from './Component3'

const Component4=lazy(()=>import('../../Component4') )
export default function Component2() {
  return (
    <>
        <h1>Component2</h1>
        <Component3/>
        <Suspense fallback="Loding Component 4">
           <Component4/>
        </Suspense>
        </>
   )
}
