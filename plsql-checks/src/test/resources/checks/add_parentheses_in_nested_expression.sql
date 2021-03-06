begin
  var := (x = 1 or x = 2 and y = 3); -- Noncompliant {{Add parentheses around this AND condition to make the operator precedence explicit.}} [[sc=20;ec=35]]
  var := (x = 1 or x = 2 and y = 3 or -- Noncompliant [[sc=20;ec=35]] 
         x = 4 and y = 5); -- Noncompliant [[sc=10;ec=25]]
  
  select 1
    into var
    from dual
   where x = 1
      or x = 2 -- Noncompliant [[sc=10;el=+1;ec=15]]
     and y = 3;
     
  -- correct
  var := (x = 1 or (x = 2 and y = 3));
  var := (x = 1 or (x = 2 and y = 3) or (x = 4 and y = 5));
  
  select 1
    into var
    from dual
   where x = 1
      or (x = 2
     and y = 3);
end;