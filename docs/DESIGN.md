# Shipping Quote Calculator

## Cost Formula

Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
volume = length * width * height
sizeFactor = Math.cbrt(volume)

finalCost = 5.00
          + (weight * 0.75)
          + (sizeFactor * 0.40)
```


Brief justification (2–4 sentences):

The formula uses weight so heavier packages cost more to ship. It also uses a size factor so large or bulky packages cost more because they take up extra space. I chose the cube root of the volume because it increases with size but doesn’t make the price jump too high for big boxes.

---

## Method List

For each method, keep it short. Include only:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type

Use at least 5 methods.

**Method 1**:
- description: Computes the volume of the package in cubic inches
- inputs: length, width, height
- output: volume
- return type: double

**Method 2**:
- description: Computes the cube-root size
- inputs: volume
- output: sizeFactor
- return type: double

**Method 3**:
- description: Calculates the final shipping cost using base cost, weight, and size factor.
- inputs: weight, sizeFactor
- output: finalCost
- return type: double

**Method 4**:
- description: Prints the shipping quote values in a formatted layout
- inputs: volume, sizeFactor, finalCost
- output: none
- return type: void

**Method 5**:
- description: Rounds a cost value to two decimal places for display
- inputs: cost
- output: roundedCost
- return type: double
