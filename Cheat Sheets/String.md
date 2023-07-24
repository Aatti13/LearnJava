# STRING CHEAT SHEET
  ## String Constructors
    - String(char chars[]): Used to create a character array.
    
    - String s = new String(<var>): Used to create a string directly.
    
    - StringBuffer --> [String(int codePoints[], int startIndex, int endIndex, int numChars)]: Another'
                        method of creating a String of a particular length.

  ## String Length
    - <var>.length(): To find the length of a string.

  ## Special String Operations
    - String Literal: Directly hardcoding string value. (e.g: String s = "Baby";).
    
    - String Concatenation: Can join either string to string or string to any other data type. (e.g: String s = "Bad "+s).

    - String Conversion via toString(): This is automatically called in System.out.println().

  ## Character Extraction
    - charsAt(): To Extract a single character from a String based on index value.
    - getchars(): To extract more than one character at a time.
    
