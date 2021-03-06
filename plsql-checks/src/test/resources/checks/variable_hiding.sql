declare
  var number;
  var2 number;
  var3 number;
  
  procedure test is
    var number; -- Noncompliant {{This variable "var" hides the declaration on line 2.}} [[sc=5;ec=8;secondary=2]]
  begin
    null;
  end;
  
  function test return number is
    var2 number; -- Noncompliant {{This variable "var2" hides the declaration on line 3.}} [[sc=5;ec=9;secondary=3]]
  begin
    null;
  end;
  
begin
  declare
    var3 number; -- Noncompliant {{This variable "var3" hides the declaration on line 4.}} [[sc=5;ec=9;secondary=4]]
  begin
    null;
  end;
end;
/

create package body test is
  var number;
  
  procedure test is
    var number; -- Noncompliant {{This variable "var" hides the declaration on line 28.}} [[sc=5;ec=8;secondary=28]]
  begin
    for i in 1..10 loop
      declare
        i number; -- Noncompliant {{This variable "i" hides the declaration on line 33.}} [[sc=9;ec=10;secondary=33]]
      begin
        null;
      end;
    end loop;
  end;
end;
/

-- correct
declare
  outer_var number;  
begin
  declare
    var number;
  begin
    null;
  end;
  
  declare
    var number;
  begin
    null;
  end;
end;
/