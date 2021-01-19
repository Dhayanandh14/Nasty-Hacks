n=gets.to_i; 
for i in 1..n
  r,e,c=gets.chomp.split.map(&:to_f)
  if(e-c==r)
    puts "does not matter";
  
  elsif(e-c>r)
    puts "advertise";
  
  else
    puts "do not advertise";
  end 
end
