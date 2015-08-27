function status = regridAndDownload(inputFile, outputFile, varName, lon, lat, plev)
%
% This function regrids data in input file according to the specified longitude, latitude, pressure level
% and output the data to output file
%
status = -1;

if nargin < 4
  status = system(['/bin/ln -s ' inputFile ' ' outputFile ';']);
  return;
end

outputFile_tmp = [outputFile(1:(end-3)) '_tmp.nc'];

if ~isempty(lon) && ~isempty(lat)
  disp('regridding longitude and latitude ...');
  status = regridLonAndLat(inputFile, outputFile_tmp, varName, lon, lat);
else
  status = system(['/bin/ln -s ' inputFile ' ' outputFile_tmp ';']);
end

if abs(plev(1) - (-999999.0)) < 1
  movefile(outputFile_tmp, outputFile);
else
  disp('regridding vertical levels ...');
  status = resampleVerticalGrid(outputFile_tmp, outputFile, varName, plev);
  delete(outputFile_tmp);
end
